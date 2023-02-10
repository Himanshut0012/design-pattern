package com.abstract_factory_dp.car;

import com.abstract_factory_dp.enums.CarType;
import com.abstract_factory_dp.enums.Location;

public abstract class Cars {

	 CarType model = null;
	    Location location = null;
		public Cars(CarType model, Location location) {
			super();
			this.model = model;
			this.location = location;
		}
	    
		 abstract void construct();

		public CarType getModel() {
			return model;
		}

		public void setModel(CarType model) {
			this.model = model;
		}

		public Location getLocation() {
			return location;
		}

		public void setLocation(Location location) {
			this.location = location;
		}

		@Override
		public String toString() {
			return "Cars [model=" + model + ", location=" + location + "]";
		}
		 
}
