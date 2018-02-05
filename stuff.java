//A file with some reference code or solutions for the interview

CRUDRepository comes with many implemented methods that can be useful.
If you want to get all entities from a single table, findAll() can be used:


@RequestMapping(value="/allstaff", method= RequestMethod.GET)
List<StaffEntity> getAllStaff(){
    return staffService.getAllStaff();
}


/////////////////

